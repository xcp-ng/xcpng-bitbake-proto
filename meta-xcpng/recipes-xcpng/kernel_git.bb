inherit xcp-ng-rpm

SRCREV = "baaf2596891daadc16c782843f421550fed2165d"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
