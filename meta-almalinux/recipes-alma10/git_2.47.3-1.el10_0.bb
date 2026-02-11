
inherit dnf-bridge

PN = "git"
PE = "0"
PV = "2.47.3"
PR = "1.el10_0"
PACKAGES = "git git-all git-core git-core-doc git-credential-libsecret git-daemon git-email git-gui git-instaweb git-subtree git-svn gitk gitweb perl-Git perl-Git-SVN"


URI_git = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git = " \
 perl-TermReadKey \
 perl-libs \
 git-core \
 git-core-doc \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Git \
 perl-IPC-Open3 \
 perl-PathTools \
 bash \
 perl-File-Find \
 perl-interpreter \
 perl-lib \
"

URI_git-all = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-all-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-all = " \
 perl-TermReadKey \
 git \
 git-credential-libsecret \
 git-daemon \
 git-email \
 perl-Git \
 git-gui \
 git-instaweb \
 git-subtree \
 git-svn \
 gitk \
"

URI_git-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-core-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-core = " \
 less \
 zlib-ng-compat \
 openssh-clients \
 openssl-libs \
 bash \
 pcre2 \
 libcurl \
 glibc \
 expat \
"

URI_git-core-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-core-doc-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-core-doc = " \
 git-core \
"

URI_git-credential-libsecret = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-credential-libsecret-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-credential-libsecret = " \
 glibc \
 libsecret \
 git \
 glib2 \
"

URI_git-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-daemon-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-daemon = " \
 systemd \
 zlib-ng-compat \
 git-core \
 bash \
 pcre2 \
 glibc \
"

URI_git-email = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-email-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-email = " \
 perl-libnet \
 perl-libs \
 perl-Getopt-Long \
 perl-Git \
 perl-Authen-SASL \
 perl-Sys-Hostname \
 perl-Term-ANSIColor \
 perl-Term-ReadLine \
 perl-Text-ParseWords \
 perl-IO-Socket-SSL \
 perl-lib \
 perl-MIME-Base64 \
 perl-MailTools \
 perl-Error \
 perl-Net-SMTP-SSL \
 git \
 perl-POSIX \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"

URI_git-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-gui-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-gui = " \
 gitk \
 bash \
 tk \
"

URI_git-instaweb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-instaweb-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-instaweb = " \
 git \
 bash \
 httpd \
 gitweb \
"

URI_git-subtree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-subtree-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-subtree = " \
 git-core \
 bash \
"

URI_git-svn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-svn-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-svn = " \
 perl-TermReadKey \
 git \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Memoize \
 perl-Digest-MD5 \
 perl-Getopt-Long \
 perl-File-Basename \
 subversion \
 perl-Git \
 perl-PathTools \
 perl-Git-SVN \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"

URI_gitk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gitk-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gitk = " \
 git-gui \
 git \
 bash \
 tk \
"

URI_gitweb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gitweb-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gitweb = " \
 perl-constant \
 git \
 perl-libs \
 perl-Digest-MD5 \
 perl-Fcntl \
 perl-File-Basename \
 perl-Encode \
 perl-filetest \
 perl-File-Find \
 perl-interpreter \
 perl-CGI \
 perl-Time-HiRes \
"

URI_perl-Git = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Git-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Git = " \
 perl-constant \
 git \
 perl-libs \
 perl-Git \
 perl-Error \
 perl-Exporter \
"

URI_perl-Git-SVN = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Git-SVN-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Git-SVN = " \
 perl-constant \
 git \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Memoize \
 perl-Fcntl \
 perl-Storable \
 perl-POSIX \
 perl-File-Basename \
 perl-Git \
 perl-IPC-Open3 \
 subversion-perl \
 perl-YAML \
 perl-Exporter \
 perl-File-Path \
 perl-base \
 perl-Time-Local \
"
