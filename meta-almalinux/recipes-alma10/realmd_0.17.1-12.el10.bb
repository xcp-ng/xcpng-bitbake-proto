
inherit dnf-bridge

PN = "realmd"
PE = "0"
PV = "0.17.1"
PR = "12.el10"
PACKAGES = "realmd realmd-devel-docs"


URI_realmd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/realmd-0.17.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:realmd = " \
 systemd-libs \
 authselect \
 krb5-libs \
 polkit \
 polkit-libs \
 bash \
 glib2 \
 glibc \
 openldap \
"

URI_realmd-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/realmd-devel-docs-0.17.1-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:realmd-devel-docs = ""
