
inherit dnf-bridge

PN = "mod_lookup_identity"
PE = "0"
PV = "1.0.0"
PR = "22.el10"
PACKAGES = "mod_lookup_identity"


URI_mod_lookup_identity = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_lookup_identity-1.0.0-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_lookup_identity = " \
 glibc \
 dbus-libs \
 httpd-core \
"
