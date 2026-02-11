
PN = "libdmx"
PE = "0"
PV = "1.1.5"
PR = "4.el10"
PACKAGES = "libdmx libdmx-devel"


URI_libdmx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdmx-1.1.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdmx = " \
 glibc \
 libX11 \
 libXext \
"

URI_libdmx-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdmx-devel-1.1.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdmx-devel = " \
 libXext-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libdmx \
"
