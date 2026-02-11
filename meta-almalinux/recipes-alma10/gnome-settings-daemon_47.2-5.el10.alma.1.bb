
PN = "gnome-settings-daemon"
PE = "0"
PV = "47.2"
PR = "5.el10.alma.1"
PACKAGES = "gnome-settings-daemon gnome-settings-daemon-server-defaults gnome-settings-daemon-devel"


URI_gnome-settings-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-settings-daemon-47.2-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-settings-daemon = "/bin/sh ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libXext.so.6()(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libXi.so.6()(64bit) ( ) libcups.so.2()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) libpulse.so.0()(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libnm.so.0()(64bit) ( ) libnm.so.0(libnm_1_0_0)(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libcanberra.so.0()(64bit) ( ) libcolord.so.2()(64bit) ( ) libnotify.so.4()(64bit) ( ) libp11-kit.so.0()(64bit) ( ) libwacom.so.9()(64bit) ( ) libwacom.so.9(LIBWACOM_2.0)(64bit) ( ) libpulse-mainloop-glib.so.0()(64bit) ( ) libupower-glib.so.3()(64bit) ( ) libcanberra-gtk3.so.0()(64bit) ( ) libgck-2.so.2()(64bit) ( ) libgweather-4.so.0()(64bit) ( ) libpulse-mainloop-glib.so.0(PULSE_0)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_213)(64bit) ( ) libgeocode-glib-2.so.0()(64bit) ( ) iio-sensor-proxy ( ) libgeoclue-2.so.0()(64bit) ( ) libgnome-desktop-3.so.20()(64bit) ( ) libgweather4(x86-64) ( ) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) ( ) libmm-glib.so.0()(64bit) ( ) colord ( >=  1.4.5) geoclue2 ( >=  2.3.1) geocode-glib2(x86-64) ( >=  3.26.3) glib2(x86-64) ( >=  2.58) gnome-desktop3(x86-64) ( >=  3.37.1) gsettings-desktop-schemas(x86-64) ( >=  42) gtk3(x86-64) ( >=  3.15.3)"
RPROVIDES:gnome-settings-daemon = "libgsd.so()(64bit) ( ) gnome-settings-daemon(x86-64) ( =  47.2-5.el10.alma.1) gnome-settings-daemon ( =  47.2-5.el10.alma.1)"

URI_gnome-settings-daemon-server-defaults = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-settings-daemon-server-defaults-47.2-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-settings-daemon-server-defaults = "gnome-settings-daemon(x86-64) ( =  47.2-5.el10.alma.1)"
RPROVIDES:gnome-settings-daemon-server-defaults = "gnome-settings-daemon-server-defaults ( =  47.2-5.el10.alma.1) gnome-settings-daemon-server-defaults(x86-64) ( =  47.2-5.el10.alma.1)"

URI_gnome-settings-daemon-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gnome-settings-daemon-devel-47.2-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-settings-daemon-devel = "/usr/bin/pkg-config ( ) gnome-settings-daemon(x86-64) ( =  47.2-5.el10.alma.1)"
RPROVIDES:gnome-settings-daemon-devel = "pkgconfig(gnome-settings-daemon) ( =  47.2) gnome-settings-daemon-devel ( =  47.2-5.el10.alma.1) gnome-settings-daemon-devel(x86-64) ( =  47.2-5.el10.alma.1)"
