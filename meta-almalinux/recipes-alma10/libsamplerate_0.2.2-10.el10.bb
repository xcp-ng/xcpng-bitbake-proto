
PN = "libsamplerate"
PE = "0"
PV = "0.2.2"
PR = "10.el10"
PACKAGES = "libsamplerate libsamplerate-devel"


URI_libsamplerate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsamplerate-0.2.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsamplerate = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libsamplerate = "libsamplerate.so.0()(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.1)(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.2)(64bit) ( ) libsamplerate ( =  0.2.2-10.el10) libsamplerate(x86-64) ( =  0.2.2-10.el10)"

URI_libsamplerate-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsamplerate-devel-0.2.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsamplerate-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libsamplerate.so.0()(64bit) ( ) libsamplerate ( =  0.2.2-10.el10)"
RPROVIDES:libsamplerate-devel = "libsamplerate-devel ( =  0.2.2-10.el10) libsamplerate-devel(x86-64) ( =  0.2.2-10.el10) pkgconfig(samplerate) ( =  0.2.2)"
