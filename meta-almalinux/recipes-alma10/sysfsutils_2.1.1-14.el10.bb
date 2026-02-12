
inherit dnf-bridge

PN = "sysfsutils"
PE = "0"
PV = "2.1.1"
PR = "14.el10"
PACKAGES = "libsysfs sysfsutils libsysfs-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/sysfsutils-2.1.1-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsysfs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsysfs-2.1.1-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsysfs}"
RDEPENDS:libsysfs = " \
 glibc \
"

URI_sysfsutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysfsutils-2.1.1-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sysfsutils}"
RDEPENDS:sysfsutils = " \
 glibc \
 libsysfs \
"

URI_libsysfs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsysfs-devel-2.1.1-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsysfs-devel}"
RDEPENDS:libsysfs-devel = " \
 libsysfs \
 pkgconf-pkg-config \
"
