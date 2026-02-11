
inherit dnf-bridge

PN = "polkit-pkla-compat"
PE = "0"
PV = "0.1"
PR = "30.el10"
PACKAGES = "polkit-pkla-compat"


URI_polkit-pkla-compat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/polkit-pkla-compat-0.1-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:polkit-pkla-compat = " \
 glibc \
 polkit \
 polkit-libs \
 glib2 \
"
