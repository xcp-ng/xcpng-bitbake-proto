
PN = "libyaml"
PE = "0"
PV = "0.2.5"
PR = "16.el10"
PACKAGES = "libyaml libyaml-devel"


URI_libyaml = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libyaml-0.2.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyaml = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libyaml = "libyaml-0.so.2()(64bit) ( ) libyaml ( =  0.2.5-16.el10) libyaml(x86-64) ( =  0.2.5-16.el10)"

URI_libyaml-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libyaml-devel-0.2.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libyaml-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libyaml(x86-64) ( =  0.2.5-16.el10)"
RPROVIDES:libyaml-devel = "libyaml-devel ( =  0.2.5-16.el10) libyaml-devel(x86-64) ( =  0.2.5-16.el10) pkgconfig(yaml-0.1) ( =  0.2.5)"
