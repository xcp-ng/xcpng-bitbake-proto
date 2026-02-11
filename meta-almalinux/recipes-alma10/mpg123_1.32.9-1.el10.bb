
PN = "mpg123"
PE = "0"
PV = "1.32.9"
PR = "1.el10"
PACKAGES = "mpg123 mpg123-libs mpg123-plugins-pulseaudio mpg123-devel"


URI_mpg123 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpg123-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpg123 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libmpg123.so.0()(64bit) ( ) libout123.so.0()(64bit) ( ) libsyn123.so.0()(64bit) ( ) mpg123-libs(x86-64) ( =  1.32.9-1.el10)"
RPROVIDES:mpg123 = "mpg123(x86-64) ( =  1.32.9-1.el10) mpg123 ( =  1.32.9-1.el10)"

URI_mpg123-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpg123-libs-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpg123-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:mpg123-libs = "libmpg123.so.0()(64bit) ( ) libout123.so.0()(64bit) ( ) libsyn123.so.0()(64bit) ( ) mpg123-libs(x86-64) ( =  1.32.9-1.el10) libmpg123 ( =  1.32.9-1.el10) libmpg123(x86-64) ( =  1.32.9-1.el10) mpg123-libs ( =  1.32.9-1.el10)"

URI_mpg123-plugins-pulseaudio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpg123-plugins-pulseaudio-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpg123-plugins-pulseaudio = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpulse.so.0()(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) libpulse-simple.so.0(PULSE_0)(64bit) ( ) mpg123(x86-64) ( =  1.32.9-1.el10)"
RPROVIDES:mpg123-plugins-pulseaudio = "mpg123-plugins-pulseaudio ( =  1.32.9-1.el10) mpg123-plugins-pulseaudio(x86-64) ( =  1.32.9-1.el10)"

URI_mpg123-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpg123-devel-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpg123-devel = "/usr/bin/pkg-config ( ) libmpg123.so.0()(64bit) ( ) libout123.so.0()(64bit) ( ) libsyn123.so.0()(64bit) ( ) mpg123-libs(x86-64) ( =  1.32.9-1.el10)"
RPROVIDES:mpg123-devel = "libmpg123-devel ( =  1.32.9-1.el10) libmpg123-devel(x86-64) ( =  1.32.9-1.el10) mpg123-devel ( =  1.32.9-1.el10) mpg123-devel(x86-64) ( =  1.32.9-1.el10) pkgconfig(libmpg123) ( =  1.32.9) pkgconfig(libout123) ( =  1.32.9) pkgconfig(libsyn123) ( =  1.32.9)"
