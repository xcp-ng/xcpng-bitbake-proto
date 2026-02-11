
PN = "open-vm-tools"
PE = "0"
PV = "12.5.0"
PR = "1.el10_0.1"
PACKAGES = "open-vm-tools open-vm-tools-desktop open-vm-tools-salt-minion open-vm-tools-sdmp open-vm-tools-test open-vm-tools-devel"


URI_open-vm-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools = " \
 systemd \
 systemd-libs \
 iproute \
 tar \
 libmspack \
 dbus-tools \
 xmlsec1 \
 xmlsec1-openssl \
 libdrm \
 util-linux \
 which \
 sed \
 libtirpc \
 openssl-libs \
 libgcc \
 libxml2 \
 grep \
 pciutils \
 bash \
 fuse3 \
 fuse3-libs \
 glib2 \
 glibc \
 coreutils \
"

URI_open-vm-tools-desktop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-desktop-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-desktop = " \
 systemd-libs \
 pango \
 libX11 \
 libdrm \
 libXext \
 libXi \
 libXinerama \
 open-vm-tools \
 libXrandr \
 libstdc++ \
 cairo \
 libXtst \
 libtirpc \
 atk \
 libgcc \
 gdk-pixbuf2 \
 bash \
 fuse3-libs \
 glib2 \
 gtk3 \
 glibc \
"

URI_open-vm-tools-salt-minion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-salt-minion-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-salt-minion = " \
 systemd \
 gawk \
 grep \
 curl \
 open-vm-tools \
 bash \
 coreutils \
"

URI_open-vm-tools-sdmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-sdmp-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-sdmp = " \
 glibc-common \
 iproute \
 gawk \
 grep \
 open-vm-tools \
 bash \
 glib2 \
 procps-ng \
 glibc \
 coreutils \
"

URI_open-vm-tools-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/open-vm-tools-test-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-test = " \
 glibc \
 glib2 \
 open-vm-tools \
"

URI_open-vm-tools-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/open-vm-tools-devel-12.5.0-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:open-vm-tools-devel = " \
 pkgconf-pkg-config \
 open-vm-tools \
"
