
inherit dnf-bridge

PN = "lshw"
PE = "0"
PV = "B.02.20"
PR = "6.el10"
PACKAGES = "lshw lshw-gui"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/lshw-B.02.20-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lshw = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lshw-B.02.20-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lshw}"
RDEPENDS:lshw = " \
 libgcc \
 hwdata \
 sqlite-libs \
 libstdc++ \
 glibc \
"

URI_lshw-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lshw-gui-B.02.20-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lshw-gui}"
RDEPENDS:lshw-gui = " \
 lshw \
 libgcc \
 gdk-pixbuf2 \
 sqlite-libs \
 polkit \
 libstdc++ \
 bash \
 glib2 \
 gtk3 \
 glibc \
"
