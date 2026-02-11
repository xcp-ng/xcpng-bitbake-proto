
PN = "guestfs-tools"
PE = "0"
PV = "1.52.2"
PR = "2.el10.alma.1"
PACKAGES = "guestfs-tools virt-win-reg guestfs-tools-bash-completion guestfs-tools-man-pages-ja guestfs-tools-man-pages-uk"


URI_guestfs-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/guestfs-tools-1.52.2-2.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:guestfs-tools = "
 gnupg2
 libxcrypt
 libosinfo
 libgcc
 json-c
 libxml2
 curl
 qemu-img
 ncurses-libs
 glib2
 pcre2
 libguestfs
 glibc
 libvirt-libs
 xz
 xz-libs
"

URI_virt-win-reg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virt-win-reg-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:virt-win-reg = "
 perl-libintl-perl
 perl-libs
 perl-Getopt-Long
 perl-File-Basename
 perl-Sys-Guestfs
 perl-hivex
 perl-interpreter
 perl-File-Temp
 perl-Pod-Usage
"

URI_guestfs-tools-bash-completion = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/guestfs-tools-bash-completion-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:guestfs-tools-bash-completion = "
 bash-completion
 guestfs-tools
"

URI_guestfs-tools-man-pages-ja = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/guestfs-tools-man-pages-ja-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:guestfs-tools-man-pages-ja = "
 guestfs-tools
"

URI_guestfs-tools-man-pages-uk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/guestfs-tools-man-pages-uk-1.52.2-2.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:guestfs-tools-man-pages-uk = "
 guestfs-tools
"
