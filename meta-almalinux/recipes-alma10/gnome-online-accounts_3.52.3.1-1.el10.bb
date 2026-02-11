
PN = "gnome-online-accounts"
PE = "0"
PV = "3.52.3.1"
PR = "1.el10"
PACKAGES = "gnome-online-accounts gnome-online-accounts-devel"


URI_gnome-online-accounts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-online-accounts-3.52.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-online-accounts = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libkeyutils.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.9.0)(64bit) ( ) gvfs-goa ( ) librest-1.0.so.0()(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.10)(64bit) ( ) gtk4(x86-64) ( >=  4.15.2) libadwaita(x86-64) ( >=  1.6~beta) glib2(x86-64) ( >=  2.78.3) libsoup3(x86-64) ( >=  3.0)"
RPROVIDES:gnome-online-accounts = "application() ( ) libgoa-1.0.so.0()(64bit) ( ) libgoa-backend-1.0.so.2()(64bit) ( ) application(org.gnome.OnlineAccounts.OAuth2.desktop) ( ) mimehandler(x-scheme-handler/com.googleusercontent.apps.44438659992-7kgjeitenc16ssihbtdjbgguch7ju55s) ( ) mimehandler(x-scheme-handler/goa-oauth2) ( ) gnome-online-accounts ( =  3.52.3.1-1.el10) gnome-online-accounts(x86-64) ( =  3.52.3.1-1.el10)"

URI_gnome-online-accounts-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-online-accounts-devel-3.52.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-online-accounts-devel = "/usr/bin/pkg-config ( ) pkgconfig(gtk4) ( ) pkgconfig(libadwaita-1) ( ) pkgconfig(goa-1.0) ( ) libgoa-1.0.so.0()(64bit) ( ) libgoa-backend-1.0.so.2()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.67.4) gnome-online-accounts(x86-64) ( =  3.52.3.1-1.el10) pkgconfig(gio-2.0) ( >=  2.67.4)"
RPROVIDES:gnome-online-accounts-devel = "gnome-online-accounts-devel ( =  3.52.3.1-1.el10) gnome-online-accounts-devel(x86-64) ( =  3.52.3.1-1.el10) pkgconfig(goa-1.0) ( =  3.52.3.1) pkgconfig(goa-backend-1.0) ( =  3.52.3.1)"
