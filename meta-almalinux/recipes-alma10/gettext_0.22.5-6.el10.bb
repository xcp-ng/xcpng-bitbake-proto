
PN = "gettext"
PE = "0"
PV = "0.22.5"
PR = "6.el10"
PACKAGES = "gettext gettext-envsubst gettext-libs gettext-runtime gettext-common-devel gettext-devel emacs-gettext msghack"


URI_gettext = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libunistring.so.5()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgettextlib-0.22.5.so()(64bit) ( ) libgettextsrc-0.22.5.so()(64bit) ( ) libgomp.so.1(GOMP_4.5)(64bit) ( ) gettext-runtime ( =  0.22.5-6.el10)"
RPROVIDES:gettext = "bundled(gnulib) ( ) gettext ( =  0.22.5-6.el10) gettext(x86-64) ( =  0.22.5-6.el10)"

URI_gettext-envsubst = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-envsubst-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-envsubst = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:gettext-envsubst = "gettext-envsubst ( =  0.22.5-6.el10) gettext-envsubst(x86-64) ( =  0.22.5-6.el10)"

URI_gettext-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-libs-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libunistring.so.5()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libacl.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libattr.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.9.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.9.1)(64bit) ( ) libattr.so.1(ATTR_1.1)(64bit) ( ) libattr.so.1(ATTR_1.3)(64bit) ( )"
RPROVIDES:gettext-libs = "libgettextlib-0.22.5.so()(64bit) ( ) libgettextsrc-0.22.5.so()(64bit) ( ) libasprintf.so.0()(64bit) ( ) libgettextpo.so.0()(64bit) ( ) gettext-libs(x86-64) ( =  0.22.5-6.el10) gettext-libs ( =  0.22.5-6.el10)"

URI_gettext-runtime = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-runtime-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-runtime = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) gettext-envsubst ( =  0.22.5-6.el10) gettext-libs(x86-64) ( =  0.22.5-6.el10)"
RPROVIDES:gettext-runtime = "gettext-runtime ( =  0.22.5-6.el10) gettext-runtime(x86-64) ( =  0.22.5-6.el10)"

URI_gettext-common-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gettext-common-devel-0.22.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:gettext-common-devel = ""
RPROVIDES:gettext-common-devel = "gettext-common-devel ( =  0.22.5-6.el10)"

URI_gettext-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gettext-devel-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) xz ( ) diffutils ( ) libasprintf.so.0()(64bit) ( ) libgettextpo.so.0()(64bit) ( ) gettext-common-devel ( =  0.22.5-6.el10) gettext ( =  0.22.5-6.el10) gettext-libs ( =  0.22.5-6.el10)"
RPROVIDES:gettext-devel = "libgnuintl.so.8()(64bit) ( ) gettext-autopoint ( =  0.22.5-6.el10) gettext-devel ( =  0.22.5-6.el10) gettext-devel(x86-64) ( =  0.22.5-6.el10)"

URI_emacs-gettext = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-gettext-0.22.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:emacs-gettext = "emacs(bin) ( >=  29.4)"
RPROVIDES:emacs-gettext = "emacs-po-mode ( ) emacs-gettext ( =  0.22.5-6.el10) emacs-gettext-el ( =  0.22.5-6.el10)"

URI_msghack = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/msghack-0.22.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:msghack = "/usr/bin/python3 ( )"
RPROVIDES:msghack = "msghack ( =  0.22.5-6.el10)"
