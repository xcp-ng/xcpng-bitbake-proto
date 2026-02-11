
PN = "efivar"
PE = "0"
PV = "39"
PR = "3.el10"
PACKAGES = "efivar-libs efivar efivar-devel"


URI_efivar-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/efivar-libs-39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efivar-libs = " \
 glibc \
"

URI_efivar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/efivar-39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efivar = " \
 glibc \
 efivar-libs \
"

URI_efivar-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/efivar-devel-39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:efivar-devel = " \
 efivar-devel \
 pkgconf-pkg-config \
 efivar-libs \
"
