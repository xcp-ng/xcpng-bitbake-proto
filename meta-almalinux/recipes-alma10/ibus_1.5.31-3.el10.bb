
PN = "ibus"
PE = "0"
PV = "1.5.31"
PR = "3.el10"
PACKAGES = "ibus ibus-gtk3 ibus-gtk4 ibus-libs ibus-setup ibus-wayland ibus-devel ibus-devel-docs ibus-panel ibus-desktop-testing ibus-tests ibus-xinit"


URI_ibus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus = "/usr/sbin/alternatives ( ) desktop-file-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libXi.so.6()(64bit) ( ) python3-gobject ( ) libibus-1.0.so.5()(64bit) ( ) iso-codes ( ) dconf ( ) libdconf.so.1()(64bit) ( ) python(abi) ( =  3.12) ibus-libs(x86-64) ( =  1.5.31-3.el10) ibus-gtk3(x86-64) ( =  1.5.31-3.el10) ibus-setup ( =  1.5.31-3.el10)"
RPROVIDES:ibus = "application() ( ) application(org.freedesktop.IBus.Panel.Emojier.desktop) ( ) application(org.freedesktop.IBus.Panel.Extension.Gtk3.desktop) ( ) ibus ( =  1.5.31-3.el10) ibus(x86-64) ( =  1.5.31-3.el10)"

URI_ibus-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-gtk3-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-gtk3 = "glib2 ( >=  2.80) rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) ibus-libs(x86-64) ( =  1.5.31-3.el10)"
RPROVIDES:ibus-gtk3 = "ibus-gtk3(x86-64) ( =  1.5.31-3.el10) ibus-gtk3 ( =  1.5.31-3.el10)"

URI_ibus-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-gtk4-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-gtk4 = "glib2 ( >=  2.80) rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) libvulkan.so.1()(64bit) ( ) ibus-libs(x86-64) ( =  1.5.31-3.el10)"
RPROVIDES:ibus-gtk4 = "libim-ibus.so()(64bit) ( ) ibus-gtk4 ( =  1.5.31-3.el10) ibus-gtk4(x86-64) ( =  1.5.31-3.el10)"

URI_ibus-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-libs-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) gobject-introspection ( ) glib2 ( >=  2.80) dbus ( >=  1.2.4)"
RPROVIDES:ibus-libs = "libibus-1.0.so.5()(64bit) ( ) ibus-libs(x86-64) ( =  1.5.31-3.el10) ibus-libs ( =  1.5.31-3.el10)"

URI_ibus-setup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-setup-1.5.31-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-setup = "/usr/bin/sh ( ) /usr/bin/python3 ( ) python3-gobject ( ) ibus ( =  1.5.31-3.el10)"
RPROVIDES:ibus-setup = "application() ( ) application(org.freedesktop.IBus.Setup.desktop) ( ) ibus-setup ( =  1.5.31-3.el10)"

URI_ibus-wayland = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-wayland-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-wayland = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) ibus-libs(x86-64) ( =  1.5.31-3.el10)"
RPROVIDES:ibus-wayland = "ibus-wayland ( =  1.5.31-3.el10) ibus-wayland(x86-64) ( =  1.5.31-3.el10)"

URI_ibus-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ibus-devel-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gobject-2.0) ( ) glib2-devel ( ) libibus-1.0.so.5()(64bit) ( ) dbus-devel ( ) gettext-runtime ( ) ibus-libs(x86-64) ( =  1.5.31-3.el10)"
RPROVIDES:ibus-devel = "ibus-devel ( =  1.5.31-3.el10) ibus-devel(x86-64) ( =  1.5.31-3.el10) pkgconfig(ibus-1.0) ( =  1.5.31)"

URI_ibus-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ibus-devel-docs-1.5.31-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-devel-docs = ""
RPROVIDES:ibus-devel-docs = "ibus-devel-docs ( =  1.5.31-3.el10)"

URI_ibus-panel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ibus-panel-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-panel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libdbusmenu-glib.so.4()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libdbusmenu-gtk3.so.4()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) libXi.so.6()(64bit) ( ) libnotify.so.4()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) ibus-libs(x86-64) ( =  1.5.31-3.el10) ibus(x86-64) ( =  1.5.31-3.el10)"
RPROVIDES:ibus-panel = "application() ( ) application(org.freedesktop.IBus.Panel.Wayland.Gtk3.desktop) ( ) ibus-panel ( =  1.5.31-3.el10) ibus-panel(x86-64) ( =  1.5.31-3.el10)"

URI_ibus-desktop-testing = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-desktop-testing-1.5.31-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-desktop-testing = "/usr/bin/sh ( ) gnome-shell-extension-no-overview ( ) ibus ( =  1.5.31-3.el10)"
RPROVIDES:ibus-desktop-testing = "ibus-desktop-testing ( =  1.5.31-3.el10)"

URI_ibus-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-tests-1.5.31-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-tests = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libXtst.so.6()(64bit) ( ) libibus-1.0.so.5()(64bit) ( ) ibus(x86-64) ( =  1.5.31-3.el10) ibus-libs(x86-64) ( =  1.5.31-3.el10)"
RPROVIDES:ibus-tests = "ibus-tests ( =  1.5.31-3.el10) ibus-tests(x86-64) ( =  1.5.31-3.el10)"

URI_ibus-xinit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-xinit-1.5.31-3.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-xinit = "/bin/sh ( ) ibus ( =  1.5.31-3.el10)"
RPROVIDES:ibus-xinit = "config(ibus-xinit) ( =  1.5.31-3.el10) ibus-xinit ( =  1.5.31-3.el10)"
