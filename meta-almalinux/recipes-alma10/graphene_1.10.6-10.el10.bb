
PN = "graphene"
PE = "0"
PV = "1.10.6"
PR = "10.el10"
PACKAGES = "graphene graphene-devel graphene-tests"


URI_graphene = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphene-1.10.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphene = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:graphene = "libgraphene-1.0.so.0()(64bit) ( ) graphene(x86-64) ( =  1.10.6-10.el10) graphene ( =  1.10.6-10.el10)"

URI_graphene-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphene-devel-1.10.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphene-devel = "/usr/bin/pkg-config ( ) libgraphene-1.0.so.0()(64bit) ( ) pkgconfig(graphene-1.0) ( ) graphene(x86-64) ( =  1.10.6-10.el10) pkgconfig(gobject-2.0) ( >=  2.30.0)"
RPROVIDES:graphene-devel = "graphene-devel ( =  1.10.6-10.el10) graphene-devel(x86-64) ( =  1.10.6-10.el10) pkgconfig(graphene-1.0) ( =  1.10.6) pkgconfig(graphene-gobject-1.0) ( =  1.10.6)"

URI_graphene-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/graphene-tests-1.10.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:graphene-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) graphene(x86-64) ( =  1.10.6-10.el10)"
RPROVIDES:graphene-tests = "graphene-tests ( =  1.10.6-10.el10) graphene-tests(x86-64) ( =  1.10.6-10.el10)"
