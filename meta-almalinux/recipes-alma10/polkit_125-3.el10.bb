
inherit dnf-bridge

PN = "polkit"
PE = "0"
PV = "125"
PR = "3.el10"
PACKAGES = "polkit polkit-libs polkit-devel polkit-docs"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/polkit-125-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_polkit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/polkit-125-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_polkit}"
RDEPENDS:polkit = " \
 shadow-utils \
 systemd \
 systemd-libs \
 pam-libs \
 polkit-libs \
 bash \
 glib2 \
 dbus \
 expat \
 glibc \
 duktape \
"

URI_polkit-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/polkit-libs-125-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_polkit-libs}"
RDEPENDS:polkit-libs = " \
 glibc \
 glib2 \
 systemd-libs \
"

URI_polkit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/polkit-devel-125-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_polkit-devel}"
RDEPENDS:polkit-devel = " \
 glib2-devel \
 polkit-devel \
 polkit-docs \
 pkgconf-pkg-config \
 polkit-libs \
"

URI_polkit-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/polkit-docs-125-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_polkit-docs}"
RDEPENDS:polkit-docs = " \
 polkit-devel \
"
