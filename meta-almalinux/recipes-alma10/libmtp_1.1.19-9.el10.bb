
inherit dnf-bridge

PN = "libmtp"
PE = "0"
PV = "1.1.19"
PR = "9.el10"
PACKAGES = "libmtp libmtp-devel libmtp-examples"


URI_libmtp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmtp-1.1.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmtp = " \
 glibc \
 libusb1 \
"

URI_libmtp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmtp-devel-1.1.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmtp-devel = " \
 libusb1-devel \
 libmtp \
 pkgconf-pkg-config \
"

URI_libmtp-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmtp-examples-1.1.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmtp-examples = " \
 glibc \
 libmtp \
"
