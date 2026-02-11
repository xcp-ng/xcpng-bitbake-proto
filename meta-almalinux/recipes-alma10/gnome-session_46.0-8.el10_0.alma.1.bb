
PN = "gnome-session"
PE = "0"
PV = "46.0"
PR = "8.el10_0.alma.1"
PACKAGES = "gnome-session gnome-session-wayland-session"


URI_gnome-session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-session-46.0-8.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-session = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) dbus ( ) libXcomposite.so.1()(64bit) ( ) libepoxy.so.0()(64bit) ( ) libICE.so.6()(64bit) ( ) libGL.so.1()(64bit) ( ) libEGL.so.1()(64bit) ( ) libSM.so.6()(64bit) ( ) libGLESv2.so.2()(64bit) ( ) system-logos ( ) dconf ( ) control-center-filesystem ( ) libgnome-desktop-3.so.20()(64bit) ( ) gsettings-desktop-schemas ( >=  0.1.7)"
RPROVIDES:gnome-session = "gnome-session(x86-64) ( =  46.0-8.el10_0.alma.1) gnome-session ( =  46.0-8.el10_0.alma.1)"

URI_gnome-session-wayland-session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-session-wayland-session-46.0-8.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-session-wayland-session = "gnome-shell ( ) gnome-session(x86-64) ( =  46.0-8.el10_0.alma.1) xorg-x11-server-Xwayland(x86-64) ( >=  1.20.99.1)"
RPROVIDES:gnome-session-wayland-session = "gnome-session-wayland-session ( =  46.0-8.el10_0.alma.1) gnome-session-wayland-session(x86-64) ( =  46.0-8.el10_0.alma.1)"
