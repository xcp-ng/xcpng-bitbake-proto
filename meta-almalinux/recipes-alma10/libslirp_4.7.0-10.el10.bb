
PN = "libslirp"
PE = "0"
PV = "4.7.0"
PR = "10.el10"
PACKAGES = "libslirp libslirp-devel"


URI_libslirp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libslirp-4.7.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libslirp = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libslirp = "libslirp.so.0()(64bit) ( ) libslirp.so.0(SLIRP_4.0)(64bit) ( ) libslirp.so.0(SLIRP_4.1)(64bit) ( ) libslirp.so.0(SLIRP_4.5)(64bit) ( ) libslirp.so.0(SLIRP_4.7)(64bit) ( ) libslirp.so.0(SLIRP_4.2)(64bit) ( ) libslirp ( =  4.7.0-10.el10) libslirp(x86-64) ( =  4.7.0-10.el10)"

URI_libslirp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libslirp-devel-4.7.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libslirp-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libslirp.so.0()(64bit) ( ) libslirp(x86-64) ( =  4.7.0-10.el10)"
RPROVIDES:libslirp-devel = "libslirp-devel ( =  4.7.0-10.el10) libslirp-devel(x86-64) ( =  4.7.0-10.el10) pkgconfig(slirp) ( =  4.7.0)"
