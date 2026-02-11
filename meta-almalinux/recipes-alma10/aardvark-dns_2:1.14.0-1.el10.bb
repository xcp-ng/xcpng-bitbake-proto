
inherit dnf-bridge

PN = "aardvark-dns"
PE = "2"
PV = "1.14.0"
PR = "1.el10"
PACKAGES = "aardvark-dns"


URI_aardvark-dns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/aardvark-dns-1.14.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:aardvark-dns = " \
 glibc \
 libgcc \
"
