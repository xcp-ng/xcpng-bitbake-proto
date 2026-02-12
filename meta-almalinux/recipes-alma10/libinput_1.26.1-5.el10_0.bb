
inherit dnf-bridge

PN = "libinput"
PE = "0"
PV = "1.26.1"
PR = "5.el10_0"
PACKAGES = "libinput libinput-utils libinput-devel libinput-test"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libinput-1.26.1-5.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libinput = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libinput-1.26.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libinput}"
RDEPENDS:libinput = " \
 libwacom \
 systemd-libs \
 mtdev \
 libevdev \
 bash \
 glibc \
"

URI_libinput-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libinput-utils-1.26.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libinput-utils}"
RDEPENDS:libinput-utils = " \
 python3 \
 python3-pyudev \
 python3-libevdev \
 systemd-libs \
 libinput \
 libevdev \
 glibc \
"

URI_libinput-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libinput-devel-1.26.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libinput-devel}"
RDEPENDS:libinput-devel = " \
 libinput \
 pkgconf-pkg-config \
"

URI_libinput-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libinput-test-1.26.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libinput-test}"
RDEPENDS:libinput-test = " \
 libwacom \
 systemd-libs \
 check \
 libinput \
 libevdev \
 glibc \
"
