inherit xcp-ng-rpm

SRCREV = "a31be1ef5cb1305a871bd225cdcb5c448a9fe40a"

DEPENDS = "python-bitarray"

EXTRA_UPSTREAM_DEPENDS = " \
https://archives.fedoraproject.org/pub/archive/fedora/linux/releases/40/Everything/x86_64/os/Packages/p/python3-mock-4.0.3-12.fc40.noarch.rpm \
"
EXTRA_UPSTREAM_DEPENDS:aarch64 = " \
https://archives.fedoraproject.org/pub/archive/fedora/linux/releases/40/Everything/aarch64/os/Packages/p/python3-mock-4.0.3-12.fc40.noarch.rpm \
"

RDEPENDS = "python-bitarray"

EXTRA_UPSTREAM_RDEPENDS = " \
http://www.rpmfind.net/linux/fedora/linux/releases/41/Everything/x86_64/os/Packages/l/libcgroup-tools-3.0-6.fc41.x86_64.rpm \
http://www.rpmfind.net/linux/fedora/linux/releases/41/Everything/x86_64/os/Packages/l/libcgroup-3.0-6.fc41.x86_64.rpm \
"

EXTRA_UPSTREAM_RDEPENDS:aarch64 = " \
http://www.rpmfind.net/linux/fedora/linux/releases/41/Everything/aarch64/os/Packages/l/libcgroup-tools-3.0-6.fc41.aarch64.rpm \
http://www.rpmfind.net/linux/fedora/linux/releases/41/Everything/aarch64/os/Packages/l/libcgroup-3.0-6.fc41.aarch64.rpm \
"
