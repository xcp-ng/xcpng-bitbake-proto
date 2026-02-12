
inherit dnf-bridge

PN = "glib-networking"
PE = "0"
PV = "2.80.0"
PR = "3.el10"
PACKAGES = "glib-networking glib-networking-tests"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/glib-networking-2.80.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_glib-networking = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/glib-networking-2.80.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glib-networking}"
RDEPENDS:glib-networking = " \
 gnutls \
 libproxy \
 ca-certificates \
 gsettings-desktop-schemas \
 glib2 \
 glibc \
"

URI_glib-networking-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/glib-networking-tests-2.80.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glib-networking-tests}"
RDEPENDS:glib-networking-tests = " \
 python3 \
 gnutls \
 glib-networking \
 bash \
 glib2 \
 glibc \
"
