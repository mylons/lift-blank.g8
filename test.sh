#!/usr/bin/env bash

rm -rf generated
g8 file://. --package=com.testing --name=generated --lift_version=2.5-SNAPSHOT
cd generated
sbt
