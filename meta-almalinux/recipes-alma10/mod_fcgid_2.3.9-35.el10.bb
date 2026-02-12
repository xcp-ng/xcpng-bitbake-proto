
inherit dnf-bridge

PN = "mod_fcgid"
PE = "0"
PV = "2.3.9"
PR = "35.el10"
PACKAGES = "mod_fcgid"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mod_fcgid-2.3.9-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mod_fcgid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_fcgid-2.3.9-35.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mod_fcgid}"
RDEPENDS:mod_fcgid = " \
 glibc \
 systemd \
 httpd-core \
"
