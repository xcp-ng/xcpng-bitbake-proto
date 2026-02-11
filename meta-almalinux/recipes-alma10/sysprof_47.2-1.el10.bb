
PN = "sysprof"
PE = "0"
PV = "47.2"
PR = "1.el10"
PACKAGES = "libsysprof sysprof sysprof-agent sysprof-capture-devel sysprof-cli sysprof-devel"


URI_libsysprof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsysprof-47.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsysprof = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libdebuginfod.so.1()(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) ( ) libdex-1.so.1()(64bit) ( )"
RPROVIDES:libsysprof = "libsysprof-6.so.6()(64bit) ( ) libsysprof-memory-6.so()(64bit) ( ) libsysprof-speedtrack-6.so()(64bit) ( ) libsysprof-tracer-6.so()(64bit) ( ) libsysprof(x86-64) ( =  47.2-1.el10) bundled(libunwind) ( =  1.8.1) libsysprof ( =  47.2-1.el10)"

URI_sysprof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-47.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysprof = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) hicolor-icon-theme ( ) libdebuginfod.so.1()(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) ( ) libdex-1.so.1()(64bit) ( ) libpanel-1.so.1()(64bit) ( ) glib2(x86-64) ( >=  2.76.0) sysprof-cli(x86-64) ( =  47.2-1.el10)"
RPROVIDES:sysprof = "metainfo() ( ) application() ( ) application(org.gnome.Sysprof.desktop) ( ) metainfo(org.gnome.Sysprof.appdata.xml) ( ) mimehandler(application/x-sysprof-capture) ( ) sysprof ( =  47.2-1.el10) sysprof(x86-64) ( =  47.2-1.el10)"

URI_sysprof-agent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-agent-47.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysprof-agent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libdebuginfod.so.1()(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) ( ) libdex-1.so.1()(64bit) ( )"
RPROVIDES:sysprof-agent = "sysprof-agent ( =  47.2-1.el10) sysprof-agent(x86-64) ( =  47.2-1.el10)"

URI_sysprof-capture-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-capture-devel-47.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysprof-capture-devel = "/usr/bin/pkg-config ( )"
RPROVIDES:sysprof-capture-devel = "pkgconfig(sysprof-capture-4) ( =  47.2) sysprof-capture-devel ( =  47.2-1.el10) sysprof-capture-devel(x86-64) ( =  47.2-1.el10) sysprof-capture-static ( =  47.2-1.el10)"

URI_sysprof-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysprof-cli-47.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysprof-cli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libdw.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libdw.so.1(ELFUTILS_0.127)(64bit) ( ) libdw.so.1(ELFUTILS_0.158)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libdebuginfod.so.1()(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) ( ) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) ( ) libpolkit-agent-1.so.0()(64bit) ( ) libdex-1.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.177)(64bit) ( ) kernel-tools ( ) libdw.so.1(ELFUTILS_0.188)(64bit) ( ) libsysprof(x86-64) ( =  47.2-1.el10)"
RPROVIDES:sysprof-cli = "sysprof-cli(x86-64) ( =  47.2-1.el10) sysprof-cli ( =  47.2-1.el10)"

URI_sysprof-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sysprof-devel-47.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysprof-devel = "/usr/bin/pkg-config ( ) pkgconfig(json-glib-1.0) ( ) pkgconfig(libsystemd) ( ) libsysprof-6.so.6()(64bit) ( ) pkgconfig(libdebuginfod) ( ) pkgconfig(glib-2.0) ( >=  2.76.0) pkgconfig(gio-2.0) ( >=  2.76.0) libsysprof(x86-64) ( =  47.2-1.el10) sysprof-capture-devel(x86-64) ( =  47.2-1.el10) pkgconfig(gio-unix-2.0) ( >=  2.76.0) pkgconfig(libdex-1) ( >=  0.8) pkgconfig(polkit-gobject-1) ( >=  0.105)"
RPROVIDES:sysprof-devel = "pkgconfig(sysprof-6) ( =  47.2) sysprof-devel ( =  47.2-1.el10) sysprof-devel(x86-64) ( =  47.2-1.el10)"
