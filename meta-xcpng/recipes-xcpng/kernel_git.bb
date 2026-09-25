inherit xcp-ng-rpm

SRCREV = "eca2e2ab244b6d610fbb0889ae68e5c9c66007f3"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
