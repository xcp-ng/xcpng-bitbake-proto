
PN = "libcanberra"
PE = "0"
PV = "0.30"
PR = "37.el10"
PACKAGES = "libcanberra libcanberra-devel libcanberra-gtk3"


URI_libcanberra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcanberra-0.30-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcanberra = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libudev.so.1()(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libgstreamer-1.0.so.0()(64bit) ( ) libpulse.so.0()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libltdl.so.7()(64bit) ( ) libtdb.so.1()(64bit) ( ) libvorbisfile.so.3()(64bit) ( ) sound-theme-freedesktop ( ) libtdb.so.1(TDB_1.2.1)(64bit) ( ) pulseaudio-libs ( >=  0.9.15)"
RPROVIDES:libcanberra = "libcanberra.so.0()(64bit) ( ) libcanberra-alsa.so()(64bit) ( ) libcanberra-gstreamer.so()(64bit) ( ) libcanberra-multi.so()(64bit) ( ) libcanberra-null.so()(64bit) ( ) libcanberra-pulse.so()(64bit) ( ) libcanberra.so.0(CANBERRA_0)(64bit) ( ) libcanberra(x86-64) ( =  0.30-37.el10) libcanberra ( =  0.30-37.el10)"

URI_libcanberra-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcanberra-devel-0.30-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcanberra-devel = "/usr/bin/pkg-config ( ) libcanberra.so.0()(64bit) ( ) libcanberra-gtk3.so.0()(64bit) ( ) pkgconfig(gtk+-3.0) ( ) pkgconfig(gdk-3.0) ( ) pkgconfig(libcanberra) ( ) libcanberra(x86-64) ( =  0.30-37.el10) libcanberra-gtk3(x86-64) ( =  0.30-37.el10)"
RPROVIDES:libcanberra-devel = "libcanberra-devel ( =  0.30-37.el10) libcanberra-devel(x86-64) ( =  0.30-37.el10) pkgconfig(libcanberra) ( =  0.30) pkgconfig(libcanberra-gtk3) ( =  0.30)"

URI_libcanberra-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcanberra-gtk3-0.30-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcanberra-gtk3 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libltdl.so.7()(64bit) ( ) libcanberra.so.0()(64bit) ( ) libgthread-2.0.so.0()(64bit) ( ) libtdb.so.1()(64bit) ( ) libvorbisfile.so.3()(64bit) ( ) libcanberra(x86-64) ( =  0.30-37.el10)"
RPROVIDES:libcanberra-gtk3 = "libcanberra-gtk3.so.0()(64bit) ( ) libcanberra-gtk3-module.so()(64bit) ( ) libcanberra-gtk3(x86-64) ( =  0.30-37.el10) libcanberra-gtk3 ( =  0.30-37.el10)"
