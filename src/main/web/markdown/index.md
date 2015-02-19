# Overview
This test suite is based on the following OGC specifications, best practices,
and discussion papers:
  * _Sensor Planning Service Implementation Specification_, version 1.0.0 [OGC 07-014r3](http://portal.opengeospatial.org/files/?artifact_id=23180)
  * _OpenGIS Web Services Common Specification_, version 1.0.0 [OGC 05-008c1](https://portal.opengeospatial.org/files/?artifact_id=8798)
  * _A URN Namespace for the Open Geospatial Consortium (OGC)_, version 2 [OGC 06-166](https://portal.opengeospatial.org/files/?artifact_id=18747)
  * _Definition Identifier URNs in OGC Namespace_, version 1.1.2 [OGC 07-092r1](https://portal.opengeospatial.org/files/?artifact_id=24045)

## What is tested

  * **Basic/Core conformance class (mandatory operations)**

    * GetCapabilities, GET method
    * DescribeTasking, POST method
    * Submit, POST method
    * DescribeResultAccess, POST method
    * This includes testing:
      * All required aspects of the mandatory operations of the SPS: GetCapabilities, DescribeTasking, Submit, and DescribeResultAccess
      * Valid exception reporting according to the specification
      * The Capabilities document lists all of the mandatory operations of the SPS specification in the OperationsMetadata section
      * Any non-mandatory operations listed in the OperationsMetadata section have valid SPS operation names
      * Valid URNs are provided where possible (as defined in the above URN documents) for values such as sensorIDs, observed properties, definitions, etc.
      * Important URLs (i.e. SensorDefinition, ServiceURL, etc.) actually link to something
      * The unique identifier in the SensorML or TML document describing a taskable sensor matches the sensorID in the SensorOffering for that sensor
      * All InputDescriptor definition types are handled: 
        * The most common commonData sub-types (including Position with location) are handled by allowing a user to enter in values for these elements directly in a user input form
        * More complex definition types are handled by allowing a user to enter the InputParameter XML elements directly in a user input form.

## What is not tested

  * Optional operations of the SPS: GetFeasibility, GetStatus, Update, and Cancel
  * SPS interaction with a Web Notification Service (WNS). Testing the interaction with a WNS would lead to developing compliance tests for the WNS. Since the WNS is not an approved OGC v1.0 specification, compliance tests have not been written, and writing these compliance tests would be beyond the scope of the SPS tests. _NOTE: During Submit tests, the tester is required to enter in WNS notification target information, specifically a WNS URL and a WNS user ID, since these are required parts of a Submit request._
  * Coordinate/axis ordering and the validity of coordinate values for GML objects with different coordinate reference systems (other than WGS 84)

## Test data

There is no test data provided for this test suite as test data in the
case of an SPS would be a specific, virtual or real sensor system. Requiring
implementers to implement a specific sensor system in order to run compliance
tests is unnecessary; therefore, these compliance tests were designed to be
generic enough to work with any SPS implementation providing access to any
sensor system.

## Namespaces

  * SensorML v1.0.0 - http://www.opengis.net/sensorML/1.0
  * SensorML v1.0.1 - http://www.opengis.net/sensorML/1.0.1
  * TML - http://www.opengis.net/tml
  * SWE Common - http://www.opengis.net/swe/1.0
  * OWS Common - http://www.opengis.net/ows
  * SPS - http;//www.opengis.net/sps/1.0
  * GML - http://www.opengis.net/gml

## Schemas

All schemas used in these tests are located in the OGC schema repository:
<http://schemas.opengis.net>.

## Release Notes
Release notes are available from the [relnotes.hmlt](relnotes.html).
