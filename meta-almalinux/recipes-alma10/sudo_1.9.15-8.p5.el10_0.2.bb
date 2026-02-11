
PN = "sudo"
PE = "0"
PV = "1.9.15"
PR = "8.p5.el10_0.2"
PACKAGES = "sudo sudo-python-plugin sudo-devel"


URI_sudo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sudo-1.9.15-8.p5.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:sudo = " \
 zlib-ng-compat \
 audit-libs \
 pam \
 pam-libs \
 glibc \
 libselinux \
 openldap \
"

URI_sudo-python-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sudo-python-plugin-1.9.15-8.p5.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:sudo-python-plugin = " \
 glibc \
 sudo \
 python3-libs \
"

URI_sudo-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sudo-devel-1.9.15-8.p5.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:sudo-devel = " \
 sudo \
"
