
PN = "anaconda"
PE = "0"
PV = "40.22.3.26"
PR = "1.el10_0.alma.1"
PACKAGES = "anaconda anaconda-core anaconda-dracut anaconda-gui anaconda-install-env-deps anaconda-install-img-deps anaconda-tui anaconda-widgets anaconda-widgets-devel anaconda-live"


URI_anaconda = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda = "anaconda-tui ( =  40.22.3.26-1.el10_0.alma.1) anaconda-gui ( =  40.22.3.26-1.el10_0.alma.1)"
RPROVIDES:anaconda = "anaconda ( =  40.22.3.26-1.el10_0.alma.1) anaconda(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-core-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-core = "/usr/bin/sh ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) systemd ( ) python3-requests ( ) python3-gobject-base ( ) crypto-policies ( ) libselinux-python3 ( ) chrony ( ) python3-systemd ( ) cracklib-dicts ( ) python3-libs ( ) dbus-daemon ( ) flatpak-libs ( ) python3-pid ( ) python3-productmd ( ) python3-pwquality ( ) python3-requests-file ( ) python3-requests-ftp ( ) /usr/bin/date ( ) crypto-policies-scripts ( ) kbd ( ) python(abi) ( =  3.12) anaconda-tui ( =  40.22.3.26-1.el10_0.alma.1) util-linux ( >=  2.15.1) glibc-langpack-en ( or  glibc-all-langpacks) NetworkManager ( >=  1.0) NetworkManager-libnm ( >=  1.0) python3-blivet ( >=  1:3.9.0-1) python3-blockdev ( >=  2.1) python3-dasbus ( >=  1.3) python3-dnf ( >=  3.6.0) python3-kickstart ( >=  3.52.7-1) python3-langtable ( >=  0.0.60) python3-meh ( >=  0.23-1) python3-pyparted ( >=  2.5-2) python3-rpm ( >=  4.15.0)"
RPROVIDES:anaconda-core = "anaconda-core ( =  40.22.3.26-1.el10_0.alma.1) anaconda-core(x86-64) ( =  40.22.3.26-1.el10_0.alma.1) anaconda-images ( =  40.22.3.26-1.el10_0.alma.1) anaconda-runtime ( =  40.22.3.26-1.el10_0.alma.1) config(anaconda-core) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-dracut-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-dracut = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) libarchive.so.13()(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) xz ( ) dnsconfd ( ) dracut-network ( ) python3-kickstart ( ) dnsconfd-dracut ( ) dracut-live ( ) iputils ( ) dracut ( >=  101-1)"
RPROVIDES:anaconda-dracut = "anaconda-dracut ( =  40.22.3.26-1.el10_0.alma.1) anaconda-dracut(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-gui-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-gui = "system-logos ( ) adwaita-icon-theme ( ) nm-connection-editor ( ) tecla ( ) python3-iso639 ( ) python3-xkbregistry ( ) NetworkManager-wifi ( ) python(abi) ( =  3.12) anaconda-core ( =  40.22.3.26-1.el10_0.alma.1) anaconda-widgets ( =  40.22.3.26-1.el10_0.alma.1) python3-meh-gui ( >=  0.23-1)"
RPROVIDES:anaconda-gui = "anaconda-gui ( =  40.22.3.26-1.el10_0.alma.1) anaconda-gui(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-install-env-deps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-install-env-deps-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-install-env-deps = "gdb ( ) e2fsprogs ( ) xfsprogs ( ) dosfstools ( ) rsync ( ) udisks2-iscsi ( ) kexec-tools ( ) realmd ( ) tmux ( ) isomd5sum ( >=  1.0.10) libblockdev-plugins-all ( >=  2.1)"
RPROVIDES:anaconda-install-env-deps = "anaconda-install-env-deps ( =  40.22.3.26-1.el10_0.alma.1) anaconda-install-env-deps(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-install-img-deps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-install-img-deps-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-install-img-deps = "openssl ( ) ostree ( ) skopeo ( ) brltty ( ) device-mapper-multipath ( ) dnsconfd ( ) mesa-dri-drivers ( ) gnome-kiosk ( ) gsettings-desktop-schemas ( ) createrepo_c ( ) gnome-remote-desktop ( ) librsvg2 ( ) nm-connection-editor ( ) python3-pam ( ) dnsconfd-dracut ( ) kdump-anaconda-addon ( ) zram-generator ( ) nvme-cli ( ) anaconda-install-env-deps ( =  40.22.3.26-1.el10_0.alma.1) fcoe-utils ( >=  1.0.12-3.20100323git) rpm-ostree ( >=  2023.2)"
RPROVIDES:anaconda-install-img-deps = "anaconda-install-img-deps ( =  40.22.3.26-1.el10_0.alma.1) anaconda-install-img-deps(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-tui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-tui-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-tui = "python(abi) ( =  3.12) anaconda-core ( =  40.22.3.26-1.el10_0.alma.1) python3-simpleline ( >=  1.9.0-1)"
RPROVIDES:anaconda-tui = "anaconda-tui ( =  40.22.3.26-1.el10_0.alma.1) anaconda-tui(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-widgets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anaconda-widgets-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-widgets = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:anaconda-widgets = "libAnacondaWidgets.so.4()(64bit) ( ) anaconda-widgets ( =  40.22.3.26-1.el10_0.alma.1) anaconda-widgets(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-widgets-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/anaconda-widgets-devel-40.22.3.26-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:anaconda-widgets-devel = "libAnacondaWidgets.so.4()(64bit) ( ) anaconda-widgets(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"
RPROVIDES:anaconda-widgets-devel = "anaconda-widgets-devel ( =  40.22.3.26-1.el10_0.alma.1) anaconda-widgets-devel(x86-64) ( =  40.22.3.26-1.el10_0.alma.1)"

URI_anaconda-live = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/anaconda-live-40.22.3.26-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:anaconda-live = "/usr/bin/bash ( ) usermode ( ) zenity ( ) anaconda-gui ( =  40.22.3.26-1.el10_0.alma.1)"
RPROVIDES:anaconda-live = "application() ( ) application(liveinst.desktop) ( ) anaconda-live ( =  40.22.3.26-1.el10_0.alma.1)"
