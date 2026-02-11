
PN = "guestfs-tools"
PE = "0"
PV = "1.52.2"
PR = "2.el10.alma.1"
PACKAGES = "guestfs-tools virt-win-reg guestfs-tools-bash-completion guestfs-tools-man-pages-ja guestfs-tools-man-pages-uk"


URI_guestfs-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/guestfs-tools-1.52.2-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:guestfs-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libvirt.so.0()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libvirt.so.0(LIBVIRT_0.0.3)(64bit) ( ) libvirt.so.0(LIBVIRT_0.1.0)(64bit) ( ) libvirt.so.0(LIBVIRT_0.1.1)(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libvirt.so.0(LIBVIRT_0.4.0)(64bit) ( ) curl ( ) libvirt.so.0(LIBVIRT_0.1.5)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) xz ( ) /usr/bin/qemu-img ( ) libguestfs.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.8)(64bit) ( ) gnupg2 ( ) libosinfo-1.0.so.0()(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.0.5)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.6)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.7.0)(64bit) ( ) libguestfs ( >=  1.49.6-1)"
RPROVIDES:guestfs-tools = "config(guestfs-tools) ( =  1.52.2-2.el10.alma.1) guestfs-tools ( =  1.52.2-2.el10.alma.1) guestfs-tools(x86-64) ( =  1.52.2-2.el10.alma.1) libguestfs-tools-c ( =  1:1.52.2-2.el10.alma.1)"

URI_virt-win-reg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-win-reg-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:virt-win-reg = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(File::Temp) ( ) perl(Pod::Usage) ( ) perl(Locale::TextDomain) ( ) perl(Sys::Guestfs) ( ) perl(Win::Hivex) ( ) perl(Win::Hivex::Regedit) ( )"
RPROVIDES:virt-win-reg = "libguestfs-tools ( =  1:1.52.2-2.el10.alma.1) virt-win-reg ( =  1.52.2-2.el10.alma.1)"

URI_guestfs-tools-bash-completion = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/guestfs-tools-bash-completion-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:guestfs-tools-bash-completion = "guestfs-tools ( =  1.52.2-2.el10.alma.1) bash-completion ( >=  2.0)"
RPROVIDES:guestfs-tools-bash-completion = "guestfs-tools-bash-completion ( =  1.52.2-2.el10.alma.1)"

URI_guestfs-tools-man-pages-ja = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/guestfs-tools-man-pages-ja-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:guestfs-tools-man-pages-ja = "guestfs-tools ( =  1.52.2-2.el10.alma.1)"
RPROVIDES:guestfs-tools-man-pages-ja = "guestfs-tools-man-pages-ja ( =  1.52.2-2.el10.alma.1)"

URI_guestfs-tools-man-pages-uk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/guestfs-tools-man-pages-uk-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:guestfs-tools-man-pages-uk = "guestfs-tools ( =  1.52.2-2.el10.alma.1)"
RPROVIDES:guestfs-tools-man-pages-uk = "guestfs-tools-man-pages-uk ( =  1.52.2-2.el10.alma.1)"
