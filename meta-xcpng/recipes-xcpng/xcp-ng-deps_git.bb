inherit xcp-ng-rpm

SRCREV = "716c022b09311121faf2460a16ff8471ce12fcbc"

RDEPENDS = " \
xcp-ng-release \
xcp-ng-config \
kernel \
blktap \
guest-templates-json \
varstored \
vncterm \
xapi \
xo-lite \
xsconsole \
xcp-ng-pv-tools \
xcp-ng-xapi-plugins \
xcp-featured \
"

# pulls qemu, not yet on aarch64
RDEPENDS:remove:aarch64 = "vncterm"
