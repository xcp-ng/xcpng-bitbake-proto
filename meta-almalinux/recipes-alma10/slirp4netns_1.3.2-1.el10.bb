
PN = "slirp4netns"
PE = "0"
PV = "1.3.2"
PR = "1.el10"
PACKAGES = "slirp4netns"


URI_slirp4netns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slirp4netns-1.3.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:slirp4netns = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libseccomp.so.2()(64bit) ( ) libslirp.so.0()(64bit) ( ) libslirp.so.0(SLIRP_4.0)(64bit) ( ) libslirp.so.0(SLIRP_4.1)(64bit) ( )"
RPROVIDES:slirp4netns = "slirp4netns ( =  1.3.2-1.el10) slirp4netns(x86-64) ( =  1.3.2-1.el10)"
