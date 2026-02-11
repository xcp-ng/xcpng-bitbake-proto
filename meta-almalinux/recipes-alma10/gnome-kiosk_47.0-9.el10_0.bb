
PN = "gnome-kiosk"
PE = "0"
PV = "47.0"
PR = "9.el10_0"
PACKAGES = "gnome-kiosk gnome-kiosk-script-session gnome-kiosk-search-appliance"


URI_gnome-kiosk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-kiosk-47.0-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-kiosk = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) libGLESv2.so.2()(64bit) ( ) libgnome-desktop-4.so.2()(64bit) ( ) libmutter-15.so.0()(64bit) ( ) libmutter-clutter-15.so.0()(64bit) ( ) libmutter-cogl-15.so.0()(64bit) ( ) libmutter-mtk-15.so.0()(64bit) ( ) gnome-settings-daemon(x86-64) ( >=  40~rc) gsettings-desktop-schemas(x86-64) ( >=  40~rc)"
RPROVIDES:gnome-kiosk = "application() ( ) application(org.gnome.Kiosk.desktop) ( ) gnome-kiosk ( =  47.0-9.el10_0) firstboot(windowmanager) ( =  gnome-kiosk) gnome-kiosk(x86-64) ( =  47.0-9.el10_0)"

URI_gnome-kiosk-script-session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-kiosk-script-session-47.0-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gnome-kiosk-script-session = "/usr/bin/sh ( ) gnome-session ( ) gnome-kiosk ( =  47.0-9.el10_0)"
RPROVIDES:gnome-kiosk-script-session = "application() ( ) application(org.gnome.Kiosk.Script.desktop) ( ) gnome-kiosk-script-session ( =  47.0-9.el10_0)"

URI_gnome-kiosk-search-appliance = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-kiosk-search-appliance-47.0-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gnome-kiosk-search-appliance = "gnome-session ( ) flatpak ( ) gnome-kiosk ( =  47.0-9.el10_0)"
RPROVIDES:gnome-kiosk-search-appliance = "application() ( ) application(org.gnome.Kiosk.SearchApp.desktop) ( ) gnome-kiosk-search-appliance ( =  47.0-9.el10_0)"
