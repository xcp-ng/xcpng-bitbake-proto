inherit xcp-ng-rpm

SRCREV = "857c943e8e9fd21b004e06bc613f103e01ba6a66"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
