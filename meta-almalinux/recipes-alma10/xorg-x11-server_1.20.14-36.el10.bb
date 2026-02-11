
PN = "xorg-x11-server"
PE = "0"
PV = "1.20.14"
PR = "36.el10"
PACKAGES = "xorg-x11-server-Xdmx xorg-x11-server-Xephyr xorg-x11-server-Xnest xorg-x11-server-Xorg xorg-x11-server-Xvfb xorg-x11-server-common xorg-x11-server-devel xorg-x11-server-source"


URI_xorg-x11-server-Xdmx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-Xdmx-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xdmx = " \
 systemd-libs \
 libX11 \
 libXau \
 libXaw \
 libselinux \
 libXdmcp \
 libXext \
 libXfixes \
 libXfont2 \
 libXi \
 libXmu \
 libXrender \
 libXt \
 libdmx \
 xorg-x11-server-common \
 audit-libs \
 openssl-libs \
 pixman \
 glibc \
"

URI_xorg-x11-server-Xephyr = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-Xephyr-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xephyr = " \
 xcb-util-wm \
 systemd-libs \
 libX11 \
 libX11-xcb \
 libXau \
 libselinux \
 libXdmcp \
 libXfont2 \
 libepoxy \
 xorg-x11-server-common \
 libglvnd-glx \
 audit-libs \
 openssl-libs \
 libxcb \
 pixman \
 libxshmfence \
 glibc \
 xcb-util \
 xcb-util-image \
 xcb-util-keysyms \
 xcb-util-renderutil \
"

URI_xorg-x11-server-Xnest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-Xnest-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xnest = " \
 libXfont2 \
 systemd-libs \
 xorg-x11-server-common \
 audit-libs \
 openssl-libs \
 libXdmcp \
 libX11 \
 libXau \
 glibc \
 libselinux \
 pixman \
 libXext \
"

URI_xorg-x11-server-Xorg = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-Xorg-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xorg = " \
 libpciaccess \
 systemd \
 systemd-libs \
 libXau \
 dbus-libs \
 libselinux \
 libXdmcp \
 libdrm \
 libXfont2 \
 libepoxy \
 xorg-x11-drv-libinput \
 xorg-x11-server-common \
 libglvnd-egl \
 libglvnd-glx \
 audit-libs \
 openssl-libs \
 bash \
 mesa-libgbm \
 pixman \
 libxshmfence \
 glibc \
"

URI_xorg-x11-server-Xvfb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-Xvfb-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-Xvfb = " \
 libXfont2 \
 systemd-libs \
 xorg-x11-server-common \
 util-linux \
 libglvnd-glx \
 audit-libs \
 openssl-libs \
 libXdmcp \
 bash \
 libXau \
 xorg-x11-xauth \
 glibc \
 libselinux \
 pixman \
"

URI_xorg-x11-server-common = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-common-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-common = " \
 xkbcomp \
 xkeyboard-config \
 pixman \
"

URI_xorg-x11-server-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-devel-1.20.14-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-server-devel = " \
 xorg-x11-util-macros \
 libpciaccess-devel \
 pkgconf-pkg-config \
 libXfont2-devel \
 xorg-x11-proto-devel \
 bash \
 pixman-devel \
"

URI_xorg-x11-server-source = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-server-source-1.20.14-36.el10.noarch.rpm;unpack=0"
RDEPENDS:xorg-x11-server-source = ""
