
PN = "PackageKit"
PE = "0"
PV = "1.2.8"
PR = "8.el10"
PACKAGES = "PackageKit PackageKit-command-not-found PackageKit-glib PackageKit-gstreamer-plugin PackageKit-gtk3-module PackageKit-glib-devel PackageKit-cron"


URI_PackageKit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit = "/bin/sh ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) /usr/bin/bash ( ) systemd ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) librpmio.so.10()(64bit) ( ) shared-mime-info ( ) libsystemd.so.0(LIBSYSTEMD_213)(64bit) ( ) libappstream.so.5()(64bit) ( ) libpackagekit-glib2.so.18()(64bit) ( ) libdnf.so.2()(64bit) ( ) python(abi) ( =  3.12) PackageKit-glib(x86-64) ( =  1.2.8-8.el10) glib2(x86-64) ( >=  2.54.0) libdnf(x86-64) ( >=  0.43.1)"
RPROVIDES:PackageKit = "metainfo() ( ) libpk_backend_dnf.so()(64bit) ( ) libpk_backend_dummy.so()(64bit) ( ) libpk_backend_test_fail.so()(64bit) ( ) libpk_backend_test_nop.so()(64bit) ( ) libpk_backend_test_spawn.so()(64bit) ( ) libpk_backend_test_succeed.so()(64bit) ( ) libpk_backend_test_thread.so()(64bit) ( ) metainfo(org.freedesktop.packagekit.metainfo.xml) ( ) PackageKit ( =  1.2.8-8.el10) PackageKit(x86-64) ( =  1.2.8-8.el10) config(PackageKit) ( =  1.2.8-8.el10)"

URI_PackageKit-command-not-found = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-command-not-found-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit-command-not-found = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) bash ( ) libpackagekit-glib2.so.18()(64bit) ( ) PackageKit-glib(x86-64) ( =  1.2.8-8.el10) PackageKit ( =  1.2.8-8.el10)"
RPROVIDES:PackageKit-command-not-found = "PackageKit-command-not-found ( =  1.2.8-8.el10) PackageKit-command-not-found(x86-64) ( =  1.2.8-8.el10) config(PackageKit-command-not-found) ( =  1.2.8-8.el10)"

URI_PackageKit-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-glib-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit-glib = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) gobject-introspection ( ) dbus ( >=  1.1.1)"
RPROVIDES:PackageKit-glib = "libpackagekit-glib2.so.18()(64bit) ( ) PackageKit-glib(x86-64) ( =  1.2.8-8.el10) PackageKit-glib ( =  1.2.8-8.el10) PackageKit-libs ( =  1.2.8-8.el10)"

URI_PackageKit-gstreamer-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-gstreamer-plugin-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit-gstreamer-plugin = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgstreamer-1.0.so.0()(64bit) ( ) libpackagekit-glib2.so.18()(64bit) ( ) PackageKit-glib(x86-64) ( =  1.2.8-8.el10)"
RPROVIDES:PackageKit-gstreamer-plugin = "PackageKit-gstreamer-plugin ( =  1.2.8-8.el10) PackageKit-gstreamer-plugin(x86-64) ( =  1.2.8-8.el10) codeina ( =  0.10.1-10)"

URI_PackageKit-gtk3-module = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-gtk3-module-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit-gtk3-module = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) pango ( ) PackageKit-glib(x86-64) ( =  1.2.8-8.el10)"
RPROVIDES:PackageKit-gtk3-module = "libpk-gtk-module.so()(64bit) ( ) PackageKit-gtk3-module ( =  1.2.8-8.el10) PackageKit-gtk3-module(x86-64) ( =  1.2.8-8.el10)"

URI_PackageKit-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/PackageKit-glib-devel-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gobject-2.0) ( ) libpackagekit-glib2.so.18()(64bit) ( ) sqlite-devel(x86-64) ( ) pkgconfig(glib-2.0) ( >=  2.62) PackageKit-glib(x86-64) ( =  1.2.8-8.el10) dbus-devel(x86-64) ( >=  1.1.1) pkgconfig(gio-unix-2.0) ( >=  2.16.1)"
RPROVIDES:PackageKit-glib-devel = "PackageKit-devel ( =  1.2.8-8.el10) PackageKit-docs ( =  1.2.8-8.el10) PackageKit-glib-devel ( =  1.2.8-8.el10) PackageKit-glib-devel(x86-64) ( =  1.2.8-8.el10) pkgconfig(packagekit-glib2) ( =  1.2.8)"

URI_PackageKit-cron = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/PackageKit-cron-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:PackageKit-cron = "/usr/bin/bash ( ) crontabs ( ) PackageKit(x86-64) ( =  1.2.8-8.el10)"
RPROVIDES:PackageKit-cron = "PackageKit-cron ( =  1.2.8-8.el10) PackageKit-cron(x86-64) ( =  1.2.8-8.el10) config(PackageKit-cron) ( =  1.2.8-8.el10)"
