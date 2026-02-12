
inherit dnf-bridge

PN = "ModemManager"
PE = "0"
PV = "1.22.0"
PR = "7.el10"
PACKAGES = "ModemManager ModemManager-glib ModemManager-devel ModemManager-glib-devel ModemManager-vala"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/ModemManager-1.22.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ModemManager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ModemManager-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ModemManager}"
RDEPENDS:ModemManager = " \
 systemd \
 ModemManager-glib \
 systemd-libs \
 libmbim \
 libmbim-utils \
 libgcc \
 libqrtr-glib \
 libqmi \
 libqmi-utils \
 libgudev \
 polkit \
 polkit-libs \
 bash \
 glib2 \
 glibc \
"

URI_ModemManager-glib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ModemManager-glib-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ModemManager-glib}"
RDEPENDS:ModemManager-glib = " \
 glibc \
 libgcc \
 glib2 \
"

URI_ModemManager-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ModemManager-devel-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ModemManager-devel}"
RDEPENDS:ModemManager-devel = " \
 ModemManager \
 pkgconf-pkg-config \
"

URI_ModemManager-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ModemManager-glib-devel-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ModemManager-glib-devel}"
RDEPENDS:ModemManager-glib-devel = " \
 ModemManager \
 ModemManager-glib \
 glib2-devel \
 ModemManager-devel \
 pkgconf-pkg-config \
"

URI_ModemManager-vala = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ModemManager-vala-1.22.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ModemManager-vala}"
RDEPENDS:ModemManager-vala = " \
 vala \
 ModemManager-glib \
"
