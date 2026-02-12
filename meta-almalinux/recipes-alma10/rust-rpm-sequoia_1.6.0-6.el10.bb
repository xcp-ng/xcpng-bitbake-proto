
inherit dnf-bridge

PN = "rust-rpm-sequoia"
PE = "0"
PV = "1.6.0"
PR = "6.el10"
PACKAGES = "rpm-sequoia rpm-sequoia-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/rust-rpm-sequoia-1.6.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rpm-sequoia = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-sequoia-1.6.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rpm-sequoia}"
RDEPENDS:rpm-sequoia = " \
 glibc \
 openssl-libs \
 libgcc \
"

URI_rpm-sequoia-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-sequoia-devel-1.6.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rpm-sequoia-devel}"
RDEPENDS:rpm-sequoia-devel = " \
 rpm-sequoia \
 openssl-devel \
 pkgconf-pkg-config \
"
