
PN = "pinentry"
PE = "0"
PV = "1.3.1"
PR = "1.el10"
PACKAGES = "pinentry pinentry-gnome3 pinentry-tty pinentry-emacs pinentry-qt"


URI_pinentry = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pinentry-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pinentry = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( )"
RPROVIDES:pinentry = "pinentry ( =  1.3.1-1.el10) pinentry(x86-64) ( =  1.3.1-1.el10) pinentry-curses ( =  1.3.1-1.el10)"

URI_pinentry-gnome3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pinentry-gnome3-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pinentry-gnome3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libgcr-4.so.4()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) pinentry ( =  1.3.1-1.el10)"
RPROVIDES:pinentry-gnome3 = "pinentry-gnome3 ( =  1.3.1-1.el10) pinentry-gnome3(x86-64) ( =  1.3.1-1.el10) pinentry-gui ( =  1.3.1-1.el10)"

URI_pinentry-tty = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pinentry-tty-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pinentry-tty = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) pinentry ( =  1.3.1-1.el10)"
RPROVIDES:pinentry-tty = "pinentry-tty ( =  1.3.1-1.el10) pinentry-tty(x86-64) ( =  1.3.1-1.el10)"

URI_pinentry-emacs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pinentry-emacs-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pinentry-emacs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) pinentry ( =  1.3.1-1.el10)"
RPROVIDES:pinentry-emacs = "pinentry-emacs ( =  1.3.1-1.el10) pinentry-emacs(x86-64) ( =  1.3.1-1.el10)"

URI_pinentry-qt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pinentry-qt-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pinentry-qt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) libncursesw.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6.7)(64bit) ( ) pinentry ( =  1.3.1-1.el10)"
RPROVIDES:pinentry-qt = "application() ( ) application(org.gnupg.pinentry-qt.desktop) ( ) pinentry-gui ( =  1.3.1-1.el10) pinentry-qt ( =  1.3.1-1.el10) pinentry-qt(x86-64) ( =  1.3.1-1.el10) pinentry-qt6 ( =  1.3.1-1.el10)"
