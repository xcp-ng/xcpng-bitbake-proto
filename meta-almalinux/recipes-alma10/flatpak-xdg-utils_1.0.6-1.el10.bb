
PN = "flatpak-xdg-utils"
PE = "0"
PV = "1.0.6"
PR = "1.el10"
PACKAGES = "flatpak-spawn flatpak-xdg-utils flatpak-xdg-utils-tests"


URI_flatpak-spawn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-spawn-1.0.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-spawn = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( )"
RPROVIDES:flatpak-spawn = "flatpak-spawn(x86-64) ( =  1.0.6-1.el10) flatpak-spawn ( =  1.0.6-1.el10)"

URI_flatpak-xdg-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-xdg-utils-1.0.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-xdg-utils = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) flatpak-spawn(x86-64) ( =  1.0.6-1.el10)"
RPROVIDES:flatpak-xdg-utils = "flatpak-xdg-utils ( =  1.0.6-1.el10) flatpak-xdg-utils(x86-64) ( =  1.0.6-1.el10)"

URI_flatpak-xdg-utils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flatpak-xdg-utils-tests-1.0.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-xdg-utils-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) flatpak-spawn(x86-64) ( =  1.0.6-1.el10) flatpak-xdg-utils(x86-64) ( =  1.0.6-1.el10)"
RPROVIDES:flatpak-xdg-utils-tests = "flatpak-xdg-utils-tests ( =  1.0.6-1.el10) flatpak-xdg-utils-tests(x86-64) ( =  1.0.6-1.el10)"
