
PN = "xorg-x11-server-Xwayland"
PE = "0"
PV = "24.1.5"
PR = "5.el10_0"
PACKAGES = "xorg-x11-server-Xwayland xorg-x11-server-Xwayland-devel"


URI_xorg-x11-server-Xwayland = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorg-x11-server-Xwayland-24.1.5-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xwayland = " \
 libXau \
 xkeyboard-config \
 xkbcomp \
 libselinux \
 libdecor \
 libXdmcp \
 libdrm \
 liboeffis \
 libXfont2 \
 libei \
 libepoxy \
 libtirpc \
 libwayland-client \
 libglvnd-egl \
 libglvnd-glx \
 audit-libs \
 openssl-libs \
 mesa-libgbm \
 libxcvt \
 pixman \
 libxshmfence \
 glibc \
"

URI_xorg-x11-server-Xwayland-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xorg-x11-server-Xwayland-devel-24.1.5-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xwayland-devel = " \
 xorg-x11-server-Xwayland \
 pkgconf-pkg-config \
"
