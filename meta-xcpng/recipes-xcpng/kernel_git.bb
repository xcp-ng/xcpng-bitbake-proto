inherit xcp-ng-rpm

SRCREV = "71602eaaadd35dc593d9282b0a42e5f6fb604768"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
