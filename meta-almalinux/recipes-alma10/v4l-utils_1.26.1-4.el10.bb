
inherit dnf-bridge

PN = "v4l-utils"
PE = "0"
PV = "1.26.1"
PR = "4.el10"
PACKAGES = "libv4l libv4l-devel libdvbv5 libdvbv5-devel libdvbv5-gconv v4l-utils v4l-utils-devel-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/v4l-utils-1.26.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libv4l = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libv4l-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libv4l}"
RDEPENDS:libv4l = " \
 glibc \
 libjpeg-turbo \
"

URI_libv4l-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libv4l-devel-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libv4l-devel}"
RDEPENDS:libv4l-devel = " \
 libv4l \
 libv4l-devel \
 pkgconf-pkg-config \
 libjpeg-turbo-devel \
"

URI_libdvbv5 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdvbv5-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvbv5}"
RDEPENDS:libdvbv5 = " \
 glibc \
 systemd-libs \
"

URI_libdvbv5-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdvbv5-devel-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvbv5-devel}"
RDEPENDS:libdvbv5-devel = " \
 systemd-devel \
 pkgconf-pkg-config \
 libdvbv5 \
"

URI_libdvbv5-gconv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdvbv5-gconv-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvbv5-gconv}"
RDEPENDS:libdvbv5-gconv = " \
 glibc \
 glibc-gconv-extra \
"

URI_v4l-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/v4l-utils-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_v4l-utils}"
RDEPENDS:v4l-utils = " \
 systemd-libs \
 systemd-udev \
 libgcc \
 libstdc++ \
 libdvbv5 \
 glibc \
 libv4l \
"

URI_v4l-utils-devel-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/v4l-utils-devel-tools-1.26.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_v4l-utils-devel-tools}"
RDEPENDS:v4l-utils-devel-tools = " \
 glibc \
 libv4l \
 libgcc \
 libstdc++ \
"
