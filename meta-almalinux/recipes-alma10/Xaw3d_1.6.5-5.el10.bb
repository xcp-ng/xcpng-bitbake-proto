
inherit dnf-bridge

PN = "Xaw3d"
PE = "0"
PV = "1.6.5"
PR = "5.el10"
PACKAGES = "Xaw3d Xaw3d-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/Xaw3d-1.6.5-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_Xaw3d = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/Xaw3d-1.6.5-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_Xaw3d}"
RDEPENDS:Xaw3d = " \
 libXmu \
 libXpm \
 libX11 \
 libXt \
 glibc \
 libXext \
"

URI_Xaw3d-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/Xaw3d-devel-1.6.5-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_Xaw3d-devel}"
RDEPENDS:Xaw3d-devel = " \
 libXext-devel \
 Xaw3d \
 libXmu-devel \
 pkgconf-pkg-config \
 libXpm-devel \
 libSM-devel \
 libX11-devel \
 xorg-x11-proto-devel \
 libXt-devel \
"
