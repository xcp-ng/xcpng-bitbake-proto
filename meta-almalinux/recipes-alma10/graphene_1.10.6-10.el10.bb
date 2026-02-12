
inherit dnf-bridge

PN = "graphene"
PE = "0"
PV = "1.10.6"
PR = "10.el10"
PACKAGES = "graphene graphene-devel graphene-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/graphene-1.10.6-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_graphene = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphene-1.10.6-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_graphene}"
RDEPENDS:graphene = " \
 glibc \
 glib2 \
"

URI_graphene-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphene-devel-1.10.6-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_graphene-devel}"
RDEPENDS:graphene-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 graphene \
 graphene-devel \
"

URI_graphene-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphene-tests-1.10.6-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_graphene-tests}"
RDEPENDS:graphene-tests = " \
 glibc \
 graphene \
"
