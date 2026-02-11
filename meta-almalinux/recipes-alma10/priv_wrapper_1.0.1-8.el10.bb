
PN = "priv_wrapper"
PE = "0"
PV = "1.0.1"
PR = "8.el10"
PACKAGES = "priv_wrapper"


URI_priv_wrapper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/priv_wrapper-1.0.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:priv_wrapper = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( )"
RPROVIDES:priv_wrapper = "libpriv_wrapper.so.0()(64bit) ( ) cmake(priv_wrapper) ( =  1.0.1) pkgconfig(priv_wrapper) ( =  1.0.1) priv_wrapper ( =  1.0.1-8.el10) priv_wrapper(x86-64) ( =  1.0.1-8.el10)"
