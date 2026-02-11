
PN = "pulseaudio"
PE = "0"
PV = "17.0"
PR = "6.el10"
PACKAGES = "pulseaudio-libs pulseaudio-libs-devel pulseaudio-libs-glib2 pulseaudio-utils"


URI_pulseaudio-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-libs-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libxcb.so.1()(64bit) ( ) libsndfile.so.1()(64bit) ( ) libsndfile.so.1(libsndfile.so.1.0)(64bit) ( ) libasyncns.so.0()(64bit) ( )"
RPROVIDES:pulseaudio-libs = "libpulse.so.0()(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) libpulse-simple.so.0(PULSE_0)(64bit) ( ) libpulsecommon-17.0.so()(64bit) ( ) libpulsedsp.so()(64bit) ( ) pulseaudio-libs(x86-64) ( =  17.0-6.el10) config(pulseaudio-libs) ( =  17.0-6.el10) pulseaudio-libs ( =  17.0-6.el10)"

URI_pulseaudio-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-libs-devel-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-libs-devel = "/usr/bin/pkg-config ( ) libpulse.so.0()(64bit) ( ) pkgconfig(glib-2.0) ( ) libpulse-mainloop-glib.so.0()(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) pkgconfig(libpulse) ( ) pulseaudio-libs(x86-64) ( =  17.0-6.el10) pulseaudio-libs-glib2(x86-64) ( =  17.0-6.el10)"
RPROVIDES:pulseaudio-libs-devel = "pkgconfig(libpulse) ( =  17.0) pkgconfig(libpulse-mainloop-glib) ( =  17.0) pkgconfig(libpulse-simple) ( =  17.0) pulseaudio-libs-devel ( =  17.0-6.el10) pulseaudio-libs-devel(x86-64) ( =  17.0-6.el10)"

URI_pulseaudio-libs-glib2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-libs-glib2-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-libs-glib2 = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpulsecommon-17.0.so()(64bit) ( ) pulseaudio-libs(x86-64) ( =  17.0-6.el10)"
RPROVIDES:pulseaudio-libs-glib2 = "libpulse-mainloop-glib.so.0()(64bit) ( ) libpulse-mainloop-glib.so.0(PULSE_0)(64bit) ( ) pulseaudio-libs-glib2(x86-64) ( =  17.0-6.el10) pulseaudio-libs-glib2 ( =  17.0-6.el10)"

URI_pulseaudio-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-utils-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libxcb.so.1()(64bit) ( ) libpulse.so.0()(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libsndfile.so.1()(64bit) ( ) libsndfile.so.1(libsndfile.so.1.0)(64bit) ( ) libpulsecommon-17.0.so()(64bit) ( ) pulseaudio-libs(x86-64) ( =  17.0-6.el10)"
RPROVIDES:pulseaudio-utils = "pulseaudio-utils ( =  17.0-6.el10) pulseaudio-utils(x86-64) ( =  17.0-6.el10)"
