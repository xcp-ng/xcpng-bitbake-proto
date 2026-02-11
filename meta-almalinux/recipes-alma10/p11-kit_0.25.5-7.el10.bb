
PN = "p11-kit"
PE = "0"
PV = "0.25.5"
PR = "7.el10"
PACKAGES = "p11-kit p11-kit-trust p11-kit-devel p11-kit-server"


URI_p11-kit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/p11-kit-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit = "
 glibc
 libffi
 libtasn1
"

URI_p11-kit-trust = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/p11-kit-trust-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit-trust = "
 p11-kit
 bash
 libtasn1
 glibc
 alternatives
"

URI_p11-kit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/p11-kit-devel-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit-devel = "
 p11-kit
 pkgconf-pkg-config
"

URI_p11-kit-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/p11-kit-server-0.25.5-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:p11-kit-server = "
 glibc
 libffi
 p11-kit
 systemd-libs
"
