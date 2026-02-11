
PN = "libportal"
PE = "0"
PV = "0.9.0"
PR = "1.el10"
PACKAGES = "libportal libportal-gtk3 libportal-gtk4 libportal-qt6 libportal-devel libportal-devel-doc libportal-gtk3-devel libportal-gtk4-devel libportal-qt6-devel"


URI_libportal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:libportal = "libportal.so.1()(64bit) ( ) libportal(x86-64) ( =  0.9.0-1.el10) libportal ( =  0.9.0-1.el10)"

URI_libportal-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-gtk3-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk3 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libportal(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-gtk3 = "libportal-gtk3.so.1()(64bit) ( ) libportal-gtk3 ( =  0.9.0-1.el10) libportal-gtk3(x86-64) ( =  0.9.0-1.el10)"

URI_libportal-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-gtk4-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk4 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libportal(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-gtk4 = "libportal-gtk4.so.1()(64bit) ( ) libportal-gtk4 ( =  0.9.0-1.el10) libportal-gtk4(x86-64) ( =  0.9.0-1.el10)"

URI_libportal-qt6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-qt6-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-qt6 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libportal.so.1()(64bit) ( ) libportal(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-qt6 = "libportal-qt6.so.1()(64bit) ( ) libportal-qt6 ( =  0.9.0-1.el10) libportal-qt6(x86-64) ( =  0.9.0-1.el10)"

URI_libportal-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-unix-2.0) ( ) libportal.so.1()(64bit) ( ) pkgconfig(gio-2.0) ( >=  2.72) libportal(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-devel = "libportal-devel(x86-64) ( =  0.9.0-1.el10) libportal-devel ( =  0.9.0-1.el10) pkgconfig(libportal) ( =  0.9.0)"

URI_libportal-devel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-devel-doc-0.9.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libportal-devel-doc = ""
RPROVIDES:libportal-devel-doc = "libportal-devel-doc ( =  0.9.0-1.el10)"

URI_libportal-gtk3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-gtk3-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk3-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-unix-2.0) ( ) pkgconfig(gtk+-3.0) ( ) pkgconfig(libportal) ( ) libportal-gtk3.so.1()(64bit) ( ) pkgconfig(gio-2.0) ( >=  2.72) libportal-devel(x86-64) ( =  0.9.0-1.el10) libportal-gtk3(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-gtk3-devel = "libportal-gtk3-devel ( =  0.9.0-1.el10) libportal-gtk3-devel(x86-64) ( =  0.9.0-1.el10) pkgconfig(libportal-gtk3) ( =  0.9.0)"

URI_libportal-gtk4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-gtk4-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk4-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-unix-2.0) ( ) pkgconfig(gtk4) ( ) pkgconfig(libportal) ( ) libportal-gtk4.so.1()(64bit) ( ) pkgconfig(gio-2.0) ( >=  2.72) libportal-devel(x86-64) ( =  0.9.0-1.el10) libportal-gtk4(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-gtk4-devel = "libportal-gtk4-devel ( =  0.9.0-1.el10) libportal-gtk4-devel(x86-64) ( =  0.9.0-1.el10) pkgconfig(libportal-gtk4) ( =  0.9.0)"

URI_libportal-qt6-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-qt6-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-qt6-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-unix-2.0) ( ) pkgconfig(libportal) ( ) pkgconfig(Qt6Core) ( ) libportal-qt6.so.1()(64bit) ( ) pkgconfig(Qt6Gui) ( ) pkgconfig(Qt6Widgets) ( ) pkgconfig(gio-2.0) ( >=  2.72) libportal-devel(x86-64) ( =  0.9.0-1.el10) libportal-qt6(x86-64) ( =  0.9.0-1.el10)"
RPROVIDES:libportal-qt6-devel = "libportal-qt6-devel ( =  0.9.0-1.el10) libportal-qt6-devel(x86-64) ( =  0.9.0-1.el10) pkgconfig(libportal-qt6) ( =  0.9.0)"
